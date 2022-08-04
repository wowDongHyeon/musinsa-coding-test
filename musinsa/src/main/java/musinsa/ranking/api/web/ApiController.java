package musinsa.ranking.api.web;

import java.util.HashMap;

import javax.annotation.Resource;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import musinsa.ranking.api.service.ApiService;
import musinsa.ranking.api.service.BrandVo;
import musinsa.ranking.api.service.ProductVo;

/**
 *
 * 브랜드,카테고리,상품에 관한 REST API를 제공합니다.
 *
 * @author 민동현
 *
 */
@Controller
@RequestMapping("/api")
public class ApiController {

	@Autowired private ApiService service;

	@Resource private Validator validator;

	/**
	 * 모든 카테고리의 상품을 브랜드 별로 자유롭게 선택해서 모든 상품을 구매할 때 최저가 조회 API
	 *
	 *
	 * @param model
	 * @param vo
	 * @throws Exception
	 */

	@RequestMapping(value = "/getMinPriceProductListByCategoryAndSum.json", method = RequestMethod.POST)
	public void getMinPriceProductListByCategoryAndSum(Model model, @RequestParam HashMap<String, String> map) throws Exception {

		model.addAttribute("result", service.getMinPriceProductListByCategoryAndSum(map));

	}

	/**
	 * 한 브랜드에서 모든 카테고리의 상품을 한꺼번에 구매할 경우 최저가 및 브랜드 조회  API
	 *
	 * ex) 입력값
	 *
	 *     결과값
	 *     		D브랜드 → 36,100원
	 *
	 * @param model
	 * @param vo
	 * @throws Exception
	 */

	@RequestMapping(value = "/getLowestPriceBrandOfAllCategory.json", method = RequestMethod.POST)
	public void getLowestPriceBrand(Model model, @RequestParam HashMap<String, String> map) throws Exception {

		model.addAttribute("result", service.getLowestPriceBrandOfAllCategory(map));

	}

	/**
	 * 각 카테고리 이름으로 최소, 최대 가격 조회 API
	 *
	 * ex) 입력값
	 * 			카테고리명(예, 상의)
	 *     결과값
	 *     		최소 : C브랜드 → 10,000원
	 *     		최대 : I브랜드 → 11,400원
	 *
	 * @param model
	 * @param vo
	 * @throws Exception
	 */

	@RequestMapping(value = "/getMaxAndMinPriceProductListByCategory.json", method = RequestMethod.POST)
	public void getMaxAndMinPriceProductListByCategory(Model model, @RequestParam HashMap<String, String> map) throws Exception {

		model.addAttribute("최소", service.getMinPriceProductListByCategory(map));

		model.addAttribute("최대", service.getMaxPriceProductListByCategory(map));

	}


	/**
	 * 브랜드를 추가합니다
	 * @param model
	 * @param vo
	 * @throws Exception
	 */

	@RequestMapping(value = "/addBrand.json", method = RequestMethod.POST)
	public void addBrand(Model model, @ModelAttribute @Valid BrandVo vo) throws Exception {

		model.addAttribute("result", service.addBrand(vo));

	}

	/**
	 * 브랜드를 수정합니다
	 * @param model
	 * @param vo
	 * @throws Exception
	 */

	@RequestMapping(value = "/editBrand.json", method = RequestMethod.POST)
	public void editBrand(Model model, @ModelAttribute @Valid BrandVo vo) throws Exception {

		model.addAttribute("result", service.editBrand(vo));

	}

	/**
	 * 브랜드를 삭제합니다
	 * @param model
	 * @param vo
	 * @throws Exception
	 */

	@RequestMapping(value = "/delBrand.json", method = RequestMethod.POST)
	public void delBrand(Model model, @ModelAttribute @Valid BrandVo vo) throws Exception {

		model.addAttribute("result", service.delBrand(vo));

	}

	/**
	 * 상품을 추가합니다
	 * @param model
	 * @param vo
	 * @throws Exception
	 */

	@RequestMapping(value = "/addProduct.json", method = RequestMethod.POST)
	public void addProduct(Model model, @ModelAttribute @Valid ProductVo vo) throws Exception {

		model.addAttribute("result", service.addProduct(vo));

	}

	/**
	 * 상품을 업데이트합니다
	 * @param model
	 * @param vo
	 * @throws Exceptionnn
	 */

	@RequestMapping(value = "/editProduct.json", method = RequestMethod.POST)
	public void editProduct(Model model, @ModelAttribute @Valid ProductVo vo) throws Exception {

		model.addAttribute("result", service.editProduct(vo));

	}

	/**
	 * 상품을 제거합니다
	 * @param model
	 * @param vo
	 * @throws Exception
	 */

	@RequestMapping(value = "/delProduct.json", method = RequestMethod.POST)
	public void delProduct(Model model, @ModelAttribute @Valid ProductVo vo) throws Exception {

		model.addAttribute("result", service.delProduct(vo));

	}

}
