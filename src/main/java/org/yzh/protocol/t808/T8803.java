package org.yzh.protocol.t808;

import org.yzh.framework.orm.annotation.Field;
import org.yzh.framework.orm.annotation.Message;
import org.yzh.framework.orm.model.AbstractMessage;
import org.yzh.framework.orm.model.DataType;
import org.yzh.protocol.basics.Header;
import org.yzh.protocol.commons.JT808;

/**
 * @author yezhihao
 * @home https://gitee.com/yezhihao/jt808-server
 */
@Message(JT808.存储多媒体数据上传)
public class T8803 extends AbstractMessage<Header> {

    private int type;
    private int channelId;
    private int event;
    private String startTime;
    private String endTime;
    private int delete;

    public T8803() {
    }

    public T8803(String mobileNo) {
        super(new Header(mobileNo, JT808.存储多媒体数据上传));
    }

    @Field(index = 0, type = DataType.BYTE, desc = "多媒体类型:0.图像；1.音频；2.视频；")
    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Field(index = 1, type = DataType.BYTE, desc = "通道ID")
    public int getChannelId() {
        return channelId;
    }

    public void setChannelId(int channelId) {
        this.channelId = channelId;
    }

    @Field(index = 2, type = DataType.BYTE, desc = "事件项编码:0.平台下发指令；1.定时动作；2.抢劫报警触发；3.碰撞侧翻报警触发；其他保留")
    public int getEvent() {
        return event;
    }

    public void setEvent(int event) {
        this.event = event;
    }

    @Field(index = 3, type = DataType.BCD8421, length = 6, desc = "起始时间YY-MM-DD-hh-mm-ss")
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    @Field(index = 9, type = DataType.BCD8421, length = 6, desc = "结束时间YY-MM-DD-hh-mm-ss")
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    @Field(index = 15, type = DataType.BYTE, desc = "删除标志:0.保留；1.删除；")
    public int getDelete() {
        return delete;
    }

    public void setDelete(int delete) {
        this.delete = delete;
    }
}