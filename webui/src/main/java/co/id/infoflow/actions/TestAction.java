package co.id.infoflow.actions;

import co.id.infoflow.services.HeheService;
import co.id.infoflow.services.ITestService;
import no.hackeriet.struts1Spring.struts.SpringBindingActionForm;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.id.infoflow.forms.TestForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestDataBinder;

@Controller("/test")
public class TestAction extends Action {

	@Autowired
	private HeheService heheService;

	@Autowired
	private ITestService testService;

	@Autowired
	private TestForm testForm;

    public ActionForward execute(ActionMapping mapping, ActionForm form,
                                 HttpServletRequest request, HttpServletResponse response) {
		SpringBindingActionForm formTmp = (SpringBindingActionForm) form;
 		ServletRequestDataBinder binder = new ServletRequestDataBinder( testForm, "TestForm");
 		binder.bind(request);
		formTmp.expose(binder.getBindingResult(), request);
		testForm.setValue( testService.getSay() );
		System.out.println( testService.getSay() );
		System.out.println( heheService.getHehe() );
		return mapping.findForward("success");
	}
}
