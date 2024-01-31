package A803.cardian.category.controller;

import A803.cardian.associate.service.AssociateService;
import A803.cardian.category.data.dto.reponse.CategoryList;
import A803.cardian.category.service.CategoryService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Tag(name = "검색 컨트롤러", description = "검색 관련 정보")
@RequestMapping("/search")
@RequiredArgsConstructor
@RestController
@CrossOrigin("*")
public class CategoryController {
    @Autowired
    private final CategoryService categoryService;
    @Autowired
    private final AssociateService associateService;

    @GetMapping("/category")
    public ResponseEntity<?> getCategories(){

        return ResponseEntity.ok(categoryService.findAllCategory());
    }

    @GetMapping("/{category_id}/association")
    public ResponseEntity<?> getSelectCategory(@PathVariable("category_id") String categoryCode){
        return ResponseEntity.ok(associateService.findAssociation(categoryCode));
    }

    @GetMapping("/category-image")
    public ResponseEntity<?> getCategoryImage(){

        return ResponseEntity.ok(categoryService.findAllCategoryImage());
    }
}
