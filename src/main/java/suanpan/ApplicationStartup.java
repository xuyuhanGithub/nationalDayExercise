package suanpan;

import com.xuelang.mqstream.handler.annotation.BussinessListener;
import com.xuelang.mqstream.message.MessageRecvService;
import com.xuelang.mqstream.message.arguments.MessageDataType;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * @author changqing.xyh
 * @date 2020/08/03 14:58
 */

@Component
@Slf4j
public class ApplicationStartup  implements ApplicationListener {
    @Autowired
    private ApplicationContext applicationContext;


    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {
        log.info("start recv msg");

        Map<String, Object> map = applicationContext.getBeansWithAnnotation(BussinessListener.class);

        Object[] bussiness = map.values().toArray();



        // 触发接收消息
        new MessageRecvService(Arrays.asList(bussiness), MessageDataType.COMMON.getCls()).subscribeMsg();
    }
}
