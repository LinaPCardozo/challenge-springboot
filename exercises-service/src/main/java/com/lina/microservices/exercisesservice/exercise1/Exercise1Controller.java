package com.lina.microservices.exercisesservice.exercise1;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lina.microservices.exercisesservice.exercise1.bean.data.Data;
import com.lina.microservices.exercisesservice.exercise1.bean.errorResponse.ErrorData;
import com.lina.microservices.exercisesservice.exercise1.bean.successResponse.SuccessAttributeConfirmation;
import com.lina.microservices.exercisesservice.exercise1.bean.successResponse.SuccessAttributeDescription;
import com.lina.microservices.exercisesservice.exercise1.bean.successResponse.SuccessData;

@RestController
public class Exercise1Controller {

	@Autowired
	private Exercise1Repository repository;
	
	@PostMapping("/security/api/session/validate")
	@ResponseBody
	public ResponseEntity<Object> insertData(@RequestBody List<Data> data) {
		
		List<SuccessData> list = new ArrayList<SuccessData>();
		SuccessData sd1 = new SuccessData(new SuccessAttributeDescription("TRANSACCIÓN EXITOSA"), "message");
		list.add(sd1);
		
		for (Data info : data) {
			if (repository.findById(info.getId()).isPresent() || info.getId() == 0) {
				ErrorData ed = new ErrorData("Tu sesión ha expirado.", "Error");
				return new ResponseEntity<Object>(ed, HttpStatus.BAD_REQUEST);
			}
			else {
				SuccessData sd2 = new SuccessData(new SuccessAttributeConfirmation(
						info.getAttributes().getTransactionDate(), 0),
						info.getType());
				int id = (int) (Math.random() * 9001 + 1000);
				sd2.setId(id);
				list.add(sd2);
			}
		}
		
		repository.saveAll(data);
		
		return new ResponseEntity<Object>(list, HttpStatus.CREATED);
		
	}
	
}
