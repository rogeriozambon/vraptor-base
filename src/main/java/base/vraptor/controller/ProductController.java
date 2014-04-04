package base.vraptor.controller;

import java.util.List;

import base.vraptor.model.Product;
import base.vraptor.dao.ProductDAO;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.view.Results;

@Resource
public class ProductController {
  private final ProductDAO dao;
  private final Result result;

  public ProductController(ProductDAO dao, Result result) {
    this.dao = dao;
    this.result = result;
  }

  @Path("/")
  public List<Product> all() {
    return dao.all();
  }
}
