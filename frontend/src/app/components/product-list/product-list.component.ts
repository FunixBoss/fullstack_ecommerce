import { Component } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Product } from 'src/app/common/product';
import { ProductService } from 'src/app/services/product.service';

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent {

  currentCategoryId: number = 1;
  products: Product[] = [];
  constructor(private productService: ProductService,
    private route: ActivatedRoute){ }

  ngOnInit(): void{
    this.route.paramMap.subscribe(() => {
      this.listProducts();
    });
  }

  listProducts(){

    if(this.route.snapshot.paramMap.has('id')) {
      // + -> trick for map string to numbe
      this.currentCategoryId = +this.route.snapshot.paramMap.get('id');
    } 

    this.productService.getPoductList(this.currentCategoryId).subscribe(
      data => {
        this.products = data;
      }
    )
  }
}
