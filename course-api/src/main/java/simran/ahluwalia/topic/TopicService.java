package simran.ahluwalia.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	private List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic("spring", "Spring framework", "Fo spring"),
			new Topic("GRE", "Magoosh gre", "To improve vocabulary")
			));
	
	public List<Topic> getAllTopics(){
		return topics;
	}
	
	public Topic getTopic(String id) {
		return topics.stream().filter(topic -> topic.getId().equals(id)).findFirst().get();
	}
	
	
	public Topic createTopic(Topic topic) {
		topics.add(topic);
		return topic; 
	}
	
	public Topic updateTopic(String id, Topic updatedTopic) {
		for(int i=0 ; i<topics.size(); i++) {
			Topic topic = topics.get(i);
			if(topic.getId().equals(id)) {
				topics.set(i, updatedTopic);
				return topics.get(i);
			}
		}
		
		return null;
	}
	
	public void removeTopic(String id) {
		topics.removeIf(topic -> topic.getId().equals(id));
	}
}
