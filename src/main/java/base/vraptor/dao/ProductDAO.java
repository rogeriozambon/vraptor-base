package base.vraptor.dao;

import base.vraptor.model.Product;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

import br.com.caelum.vraptor.ioc.Component;

@Component
public class ProductDAO {
  private final Session session;

  public ProductDAO(Session session) {
    this.session = session;
  }

  public List<Product> all() {
    return this.session.createCriteria(Product.class).list();
  }

  public void save(Product product) {
    Transaction transaction = session.beginTransaction();
    session.save(product);
    transaction.commit();
  }

  public void update(Product product) {
    Transaction transaction = session.beginTransaction();
    session.update(product);
    transaction.commit();
  }

  public Product load(Long id) {
    return (Product)session.load(Product.class, id);
  }

  public void delete(Product product) {
    Transaction transaction = session.beginTransaction();
    session.delete(product);
    transaction.commit();
  }

  public List<Product> find(String name) {
    return session.createCriteria(Product.class)
      .add(Restrictions.ilike("name", name, MatchMode.ANYWHERE))
      .list();
  }

  public void reload(Product product) {
    session.refresh(product);
  }
}
