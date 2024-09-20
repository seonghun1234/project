package com.example.demo.repository;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.example.demo.vo.ProductReview;

@Mapper
public interface ReviewRepository {

    // 페이지네이션을 적용하여 특정 제품의 리뷰 리스트 가져오기
	@Select("""
		    SELECT * FROM product_reviews 
		    WHERE product_id = #{productId}
		    ORDER BY regDate DESC
		    LIMIT #{offset}, #{limit}
		    """)
		List<ProductReview> getProductReviewsWithPagination(@Param("productId") int productId, 
		                                                    @Param("offset") int offset, 
		                                                    @Param("limit") int limit);
    // 특정 제품의 리뷰 총 개수 구하기
    @Select("SELECT COUNT(*) FROM product_reviews WHERE product_id = #{productId}")
    int countReviewsByProductId(@Param("productId") int productId);

    // 리뷰 추가하기
    @Insert("""
            INSERT INTO product_reviews (product_id, userName, content, rating, writerNickname, created_at)
            VALUES (#{productId}, #{userName}, #{content}, #{rating}, #{writerNickname}, NOW())
            """)
    int addReview(@Param("productId") int productId, 
                   @Param("userName") String userName, 
                   @Param("content") String content, 
                   @Param("rating") int rating, 
                   @Param("writerNickname") String writerNickname);
}