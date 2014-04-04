package base.vraptor.services.session;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import br.com.caelum.vraptor.ioc.Component;
import br.com.caelum.vraptor.ioc.ComponentFactory;

@Component
public class SessionCreator implements ComponentFactory<Session> {
  private final SessionFactory factory;
  private Session session;

  public SessionCreator(SessionFactory factory) {
    this.factory = factory;
  }

  @PostConstruct
  public void createSession() {
    this.session = factory.openSession();
  }

  @Override
  public Session getInstance() {
    return this.session;
  }

  @PreDestroy
  public void destroySession() {
    this.session.close();
  }
}
