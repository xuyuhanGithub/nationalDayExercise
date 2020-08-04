package suanpan;

import com.xuelang.mqstream.MqClient;
import com.xuelang.mqstream.RedisStreamMqClient;
import com.xuelang.mqstream.message.MqSendService;
import com.xuelang.mqstream.message.MqSendServiceFactory;
import com.xuelang.mqstream.options.Message;

/**
 * @author changqing.xyh
 * @date 2020/08/03 15:20
 */

public class MqClientTest {
    public static void main(String[] args) {
        Message message = Message.builder()
                .queue("test_queue")
                .keysAndValues(
                        Message.prepareKeysAndValues("name", "xuelang", "city", "wuxi")
                )
                .build();

        MqClient mqClient = new RedisStreamMqClient("127.0.0.1");
        String messageId = mqClient.sendMessage(message);


        MqSendService mqSendService = MqSendServiceFactory.getMqSendService();
//        mqSendService.sendSuccessMessageToTarget();
        System.out.println(messageId);
    }


}
