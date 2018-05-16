package com.chandreshv.dockers.dockerspringBootapp.res;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/myproject/message")
public class SampleRestController {
	
	@GetMapping
	public String printMessage() {
		JSONObject response = new JSONObject();
		try {
			response.put("response", new JSONObject().put("hello", "world"));
			response.put("message", "Successful");
			response.put("status", 200);
		} catch (JSONException e) {
			e.printStackTrace();
		}

		return response.toString();
	}
}
