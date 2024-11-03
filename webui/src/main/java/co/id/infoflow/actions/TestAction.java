package co.id.infoflow.actions;

import co.id.infoflow.services.HeheService;
import co.id.infoflow.services.TestService;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.id.infoflow.forms.TestForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller("/test")
public class TestAction extends Action {

	@Autowired
	private HeheService heheService;

	@Autowired
	private TestService testService;

    public ActionForward execute(ActionMapping mapping, ActionForm form,
                                 HttpServletRequest request, HttpServletResponse response) {
//		SpringBindingActionForm formTmp = (SpringBindingActionForm) form;
//		TestForm bean = new TestForm();
// 		ServletRequestDataBinder binder = new ServletRequestDataBinder(bean, "myPojo");
// 		binder.bind(request);
//		formTmp.expose(binder.getBindingResult(), request);
		TestForm testForm = (TestForm) form;
		testForm.setValue( testService.getSay() );
		System.out.println( testService.getSay() );
		System.out.println( heheService.getHehe() );
		return mapping.findForward("success");
	}
}
