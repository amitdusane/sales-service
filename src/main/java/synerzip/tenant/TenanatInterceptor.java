package synerzip.tenant;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

@Component
public class TenanatInterceptor extends HandlerInterceptorAdapter {

	private static final String TENANT_HEADER = "X-TenantID";

	 @Override
	  public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object handler)
	      throws Exception {

	    String tenant = req.getHeader(TENANT_HEADER);
	    boolean tenantSet = false;

	    if(tenant == null ||  tenant.length() == 0) {
	      res.setStatus(HttpServletResponse.SC_BAD_REQUEST);
	      res.setContentType(MediaType.APPLICATION_JSON_VALUE);
	      res.getWriter().write("{\"error\": \"No tenant supplied\"}");
	      res.getWriter().flush();
	    } else {
	      TenantContext.setCurrentTenant(tenant);
	      tenantSet = true;
	    }

	    return tenantSet;
	  }

	  @Override
	  public void postHandle(
	      HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView)
	          throws Exception {
	    TenantContext.clear();
	  }
	
}
