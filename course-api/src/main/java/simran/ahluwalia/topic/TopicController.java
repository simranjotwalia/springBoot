package simran.ahluwalia.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@Autowired
	private TopicService topicService;
	
	@GetMapping(value = {"/topics"})
	public List<Topic> getAllTopics(){
		return topicService.getAllTopics();
	}
	
	@GetMapping(value = {"/topics/{id}"})
	public Topic getTopic(@PathVariable String id) {
		return topicService.getTopic(id);
	}
	
	@PostMapping(value = {"/topics"})
	public Topic addTopic(@RequestBody Topic topic) {
		return topicService.createTopic(topic);
	}
	
	@PutMapping(value = "/topics/{id}")
	public Topic updateTopic(@PathVariable String id, @RequestBody Topic topic) {
		return topicService.updateTopic(id, topic);
	}
	
	@DeleteMapping(value = "/topics/{id}")
	public void deleteTopic (@PathVariable String id) {
		topicService.removeTopic(id);
	}
}
