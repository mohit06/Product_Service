package com.product;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@org.springframework.cloud.openfeign.FeignClient(name="coupon", url="localhost:8000")  
public interface FeignProduct {


	
	@GetMapping("/getCouponDetails/{couponCode}")
	public CouponDetails getCouponDetails(@PathVariable String couponCode);
	
	
}
