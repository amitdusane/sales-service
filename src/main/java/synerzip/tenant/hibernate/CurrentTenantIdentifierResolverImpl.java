package synerzip.tenant.hibernate;

import org.hibernate.context.spi.CurrentTenantIdentifierResolver;
import org.springframework.stereotype.Component;

import synerzip.tenant.TenantContext;

@Component
public class CurrentTenantIdentifierResolverImpl implements CurrentTenantIdentifierResolver {

	@Override
	public String resolveCurrentTenantIdentifier() {
		return TenantContext.getCurrentTenant();
	}

	@Override
	public boolean validateExistingCurrentSessions() {
	
		return true;
	}

}
