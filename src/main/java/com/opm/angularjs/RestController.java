package com.opm.angularjs;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.opm.angularjs.model.Team;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping("/team")
public class RestController {
	
	private static final Logger logger = LoggerFactory.getLogger(RestController.class);
	
	private static Map<String, Team> map;
	
	@RequestMapping(value = "/{name}", method = RequestMethod.GET)	
	public @ResponseBody Team getTeam(@PathVariable("name") String name) {
		logger.info("getTeam : " + name);
		getTeamMock();
		

		
		return map.get(name);
	}

	@RequestMapping(value = "/all", method = RequestMethod.GET)	
	public @ResponseBody Team[] getAllTeam() {
		
		getTeamMock();
		

		return map.values().toArray(new Team[map.size()]);

	}

	private Map<String,Team> getTeamMock() {
		// TODO Auto-generated method stub
		if (map == null) {
			map = new HashMap<String, Team>();
			map.put("PE", new Team("Peru", 8 , 4, 4, 10, 9));
			map.put("URU", new Team("Uruguay", 8 , 4, 4, 10, 9));
			map.put("ARG", new Team("Argentina", 8 , 6, 6, 10, 9));
			
		}
		
		
		return map;
	}
}
