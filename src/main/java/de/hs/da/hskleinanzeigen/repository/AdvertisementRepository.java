package de.hs.da.hskleinanzeigen.repository;

import de.hs.da.hskleinanzeigen.entities.Advertisement;
import de.hs.da.hskleinanzeigen.entities.Advertisement.AD_TYPE;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AdvertisementRepository extends
    PagingAndSortingRepository<Advertisement, Integer> {


  Page<Advertisement> findByCategory(Pageable pageable, @Param("c") int categoryId);

  Page<Advertisement> findByCategoryPriceFrom(Pageable pageable, @Param("c") int categoryId,
      @Param("pf") int priceFrom);

  Page<Advertisement> findByType(Pageable pageable, @Param("t") AD_TYPE type);

  Page<Advertisement> findByTypeCategory(Pageable pageable, @Param("t") AD_TYPE type,
      @Param("c") int categoryId);

  Page<Advertisement> findByTypeCategoryPriceTo(Pageable pageable, @Param("t") AD_TYPE type,
      @Param("c") int categoryId, @Param("pt") int priceTo);

  Page<Advertisement> findByTypePriceToPriceFrom(Pageable pageable, @Param("t") AD_TYPE type,
      @Param("pt") int priceTo, @Param("pf") int priceFrom);

  Page<Advertisement> findByTypePriceTo(Pageable pageable, @Param("t") AD_TYPE type,
      @Param("pt") int priceTo);

  Page<Advertisement> findByCategoryPriceTo(Pageable pageable,
      @Param("c") int categoryId, @Param("pt") int priceTo);

  Page<Advertisement> findByTypePriceFrom(Pageable pageable, @Param("t") AD_TYPE type,
      @Param("pf") int priceFrom);

  Page<Advertisement> findByTypeCategoryPriceFrom(Pageable pageable, @Param("t") AD_TYPE type,
      @Param("c") int categoryId, @Param("pf") int priceFrom);

  Page<Advertisement> findByPriceTo(Pageable pageable, @Param("pt") int priceTo);

  Page<Advertisement> findByPriceToPriceFrom(Pageable pageable, @Param("pt") int priceTo,
      @Param("pf") int priceFrom);

  Page<Advertisement> findByPriceFrom(Pageable pageable, @Param("pf") int priceFrom);

  Page<Advertisement> findByCategoryPriceToPriceFrom(Pageable pageable,
      @Param("c") int categoryId, @Param("pt") int priceTo, @Param("pf") int priceFrom);

  Page<Advertisement> findByTypeCategoryPriceToPriceFrom(Pageable pageable,
      @Param("t") AD_TYPE type,
      @Param("c") int categoryId, @Param("pt") int priceTo, @Param("pf") int priceFrom);

  Page<Advertisement> findAdvertisements(Pageable pageable,
      @Param("t") AD_TYPE type,
      @Param("c") Integer categoryId, @Param("pf") Integer priceFrom, @Param("pt") Integer priceTo);
}
