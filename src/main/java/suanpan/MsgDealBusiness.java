package suanpan;

import com.alibaba.fastjson.JSON;
import com.xuelang.mqstream.handler.annotation.BussinessListener;
import com.xuelang.mqstream.handler.annotation.BussinessListenerMapping;
import com.xuelang.mqstream.message.arguments.CommonType;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author changqing.xyh
 * @date 2020/08/03 15:00
 */

@BussinessListener
@Component
@Slf4j
public class MsgDealBusiness {
    @BussinessListenerMapping
    public Object dealCommonTypeMsg(CommonType commonType) {
        log.info("receive msg == " + commonType == null ? "" : JSON.toJSONString(commonType));

        //todo 在此处处理业务

        return "success";
    }
}
