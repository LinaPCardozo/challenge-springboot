package com.lina.microservices.exercisesservice.exercise3;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lina.microservices.exercisesservice.exercise3.bean.successResponse.AvailableAmount;
import com.lina.microservices.exercisesservice.exercise3.bean.successResponse.ErrorDescription;
import com.lina.microservices.exercisesservice.exercise3.bean.successResponse.SolicitationStatus;
import com.lina.microservices.exercisesservice.exercise3.bean.successResponse.SuccessData;

@RestController
public class Exercise3Controller {

	@GetMapping("/solicitations/v1/solicitations/{solicitation_id}")
	@ResponseBody
	public ResponseEntity<Object> retrieveData(@PathVariable int solicitation_id, @RequestParam String solicitation_type) {
		
		SuccessData sd = new SuccessData(solicitation_id, solicitation_type, 
				new SolicitationStatus(200, "The request was solved with success!", 0, 
						new ErrorDescription(), new AvailableAmount("USD", 1200)));
		
		return new ResponseEntity<Object>(sd, HttpStatus.OK);
		
	}
	
}
