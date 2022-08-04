package musinsa.ranking.api.service;


import java.util.ArrayList;
import java.util.HashMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;


@Service
public class ApiService extends EgovAbstractServiceImpl {

	@Autowired private BrandMapper brandMapper;

	@Autowired private ProductMapper productMapper;


	/**
	 * 모든 카테고리의 상품을 브랜드 별로 자유롭게 선택해서 모든 상품을 구매할 때 최저가를 반환합니다
	 * @param map
	 * @return
	 */
	public ArrayList<HashMap<String, String>> getMinPriceProductListByCategoryAndSum(HashMap<String, String> map) {

		return (ArrayList<HashMap<String, String>>) productMapper.getMinPriceProductListByCategoryAndSum(map);

	}

	/**
	 * 한 브랜드에서 모든 카테고리의 상품을 한꺼번에 구매할 경우 최저가를 반환합니다
	 * @param map
	 * @return
	 */
	public ArrayList<HashMap<String, String>> getLowestPriceBrandOfAllCategory(HashMap<String, String> map) {

		return (ArrayList<HashMap<String, String>>) productMapper.getLowestPriceBrandOfAllCategory(map);

	}


	/**
	 * 각 카테고리 이름으로 최소 가격을 반환합니다
	 * @param map
	 * @return
	 */
	public ArrayList<HashMap<String, String>> getMinPriceProductListByCategory(HashMap<String, String> map) {

		return (ArrayList<HashMap<String, String>>) productMapper.getMinPriceProductListByCategory(map);

	}

	/**
	 * 각 카테고리 이름으로 최대 가격을 반환합니다
	 * @param map
	 * @return
	 * @throws Exception
	 */
	public ArrayList<HashMap<String, String>> getMaxPriceProductListByCategory(HashMap<String, String> map) throws Exception {

		return (ArrayList<HashMap<String, String>>) productMapper.getMaxPriceProductListByCategory(map);
	}



	/**
	 * 브랜드를 추가합니다
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	public String addBrand(BrandVo vo) throws Exception {
		String result = "success";

		try{

			brandMapper.add(vo);

		}catch(Exception e){
			e.printStackTrace();
			result = ApiUtil.makeErrorMessage(vo.getBrandName(), e);
		}

		return result;
	}

	/**
	 * 브랜드를 수정합니다
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	public String editBrand(BrandVo vo) throws Exception {
		String result = "success";

		try{

			brandMapper.edit(vo);

		}catch(Exception e){
			e.printStackTrace();
			result = ApiUtil.makeErrorMessage(vo.getBrandName(), e);
		}

		return result;
	}


	/**
	 * 브랜드를 삭제합니다
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	public String delBrand(BrandVo vo) throws Exception {
		String result = "success";

		try{

			brandMapper.del(vo);

		}catch(Exception e){
			e.printStackTrace();
			result = ApiUtil.makeErrorMessage(vo.getBrandName(), e);
		}

		return result;
	}


	/**
	 * 상품을 추가합니다
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	public String addProduct(ProductVo vo) throws Exception {
		String result = "success";

		try{

			productMapper.add(vo);

		}catch(Exception e){
			e.printStackTrace();
			result = ApiUtil.makeErrorMessage(vo.getProductName(), e);
		}

		return result;
	}

	/**
	 * 상품을 업데이트합니다
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	public String editProduct(ProductVo vo) throws Exception {
		String result = "success";

		try{

			productMapper.edit(vo);

		}catch(Exception e){
			e.printStackTrace();
			result = ApiUtil.makeErrorMessage(vo.getProductName(), e);
		}

		return result;
	}

	/**
	 * 상품을 제거합니다
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	public String delProduct(ProductVo vo) throws Exception {
		String result = "success";

		try{

			productMapper.del(vo);

		}catch(Exception e){
			e.printStackTrace();
			result = ApiUtil.makeErrorMessage(vo.getProductName(), e);
		}

		return result;
	}

}
