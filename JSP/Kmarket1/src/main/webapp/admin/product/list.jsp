<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="../_header.jsp"/>
            <section id="admin-product-list">
                <nav>
                    <h3>상품목록</h3>
                    <p>
                        HOME > 상품관리 > <strong>상품목록</strong>
                    </p>
                </nav>
                <!-- 상품목록 컨텐츠 시작 -->           
                           
                <section>
                    <div>
                        <select name="search">
                            <option value="search1">상품명</option>
                            <option value="search1">상품코드</option>
                            <option value="search1">제조사</option>
                            <option value="search1">판매자</option>                                    
                        </select>
                        <input type="text" name="search">
                    </div>
                    <table>
                        <tr>
                            <th><input type="checkbox" name="all"/></th>
                            <th>이미지</th>
                            <th>상품코드</th>
                            <th>상품명</th>
                            <th>판매가격</th>
                            <th>할인율</th>
                            <th>포인트</th>
                            <th>재고</th>
                            <th>판매자</th>
                            <th>조회</th>
                            <th>관리</th>
                        </tr>
						<c:forEach var="product" items="${ products }">
                        <tr>
                            <td><input type="checkbox" name="상품코드"/></td>
                            <td><a href="/Kmarket1/product.do?no=${ product.prodNo }"></a><img src="../img/sample_thumb.jpg" class="thumb"></td>
                            <td>${ product.prodNo }</td>
                           	<td>${ product.prodName }</td>
                            <td>${ product.price }</td>                       
                            <td>${ product.discount }</td>
                            <td>${ product.point }</td>
                            <td>${ product.stock }</td>
                            <td>${ product.seller }</td>
                            <td>${product.hit }</td>
                            <td>               
                                <a href="/Kmarket1/admin/product/delete.do?group=${group}&cate=${cate}&pg=${ pg }&no=${ product.no }" class="Remove">[삭제]</a>
                                <a href="/Kmarket1/admin/product/modify.do?${group}&cate=${cate}&pg=${ pg }&no=${ product.no }" class="Modify">[수정]</a>
                            </td>
                        </tr>
                        </c:forEach>
                        <tr>
                            <td><input type="checkbox" name="상품코드"/></td>
                            <td><img src="../img/sample_thumb.jpg" class="thumb"></td>
                            <td>201603292</td>
                            <td>FreeMovement BLUEFORCE</td>
                            <td>36,000</td>
                            <td>10</td>
                            <td>360</td>
                            <td>400</td>
                            <td>홍길동</td>
                            <td>126</td>
                            <td>
                                <a href="#">[삭제]</a>
                                <a href="#">[수정]</a>
                            </td>
                        </tr>
                        <tr>
                            <td><input type="checkbox" name="상품코드"/></td>
                            <td><img src="../img/sample_thumb.jpg" class="thumb"></td>
                            <td>201603292</td>
                            <td>FreeMovement BLUEFORCE</td>
                            <td>36,000</td>
                            <td>10</td>
                            <td>360</td>
                            <td>400</td>
                            <td>홍길동</td>
                            <td>126</td>
                            <td>
                                <a href="#">[삭제]</a>
                                <a href="#">[수정]</a>
                            </td>
                        </tr>
                        
                    </table>

                    
                    <input type="button" value="선택삭제" />                          


                    <div class="paging">
                        <span class="prev">
                            <a href="#"><&nbsp;이전</a>
                        </span>
                        <span class="num">
                            <a href="#" class="on">1</a>
                            <a href="#">2</a>
                            <a href="#">3</a>
                            <a href="#">4</a>
                            <a href="#">5</a>
                            <a href="#">6</a>
                            <a href="#">7</a>
                        </span>
                        <span class="next">
                            <a href="#">다음&nbsp;></a>
                        </span>
                        </div>

                </section>                

                
                <p class="ico info">
                    <strong>Tip!</strong>
                    전자상거래 등에서의 상품 등의 정보제공에 관한 고시에 따라 총 35개 상품군에 대해 상품 특성 등을 양식에 따라 입력할 수 있습니다.
                </p>
                
                <!-- 상품목록 컨텐츠 끝 -->
            </section>
        </main>
<jsp:include page="../_footer.jsp"/>