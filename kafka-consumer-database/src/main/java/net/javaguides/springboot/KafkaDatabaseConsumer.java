package net.javaguides.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import net.javaguides.springboot.entity.WikimediaData;
import net.javaguides.springboot.repository.WikimediaDataRepository;

@Service
public class KafkaDatabaseConsumer {
	
	private WikimediaDataRepository wikimediaDataRepository;
	
	
	@Autowired
	public KafkaDatabaseConsumer(WikimediaDataRepository wikimediaDataRepository) {
		this.wikimediaDataRepository = wikimediaDataRepository;
	}



	@KafkaListener(
			topics = "wikimedia_recentchange", 
			groupId = "myGroup"
			)
	public void consume(String message) {
		System.out.println("Message is: "+message);
		
		WikimediaData data = new WikimediaData();
		//data.setWikiEventData(message);
		
		data.setWikiEventData(message);
		
		wikimediaDataRepository.save(data);
	}
}
