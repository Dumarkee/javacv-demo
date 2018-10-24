package com.xinchao.javacv;

import com.xinchao.javacv.utils.JavacvUtil;
import org.junit.Test;

/**
 * @Auther: 杜威
 * @Date: 2018/10/24 11:07
 * @Description:
 */
public class JavacvUtilTest {


    @Test
    public void testRecordCameraToLocal() {
        try {
            JavacvUtil.recordCamera("D:/output.mp4",25);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testRecordCameraToRTSP() {
        try {
            JavacvUtil.recordCamera("rtmp://localhost:1935/hls/record1",25);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testFrameRecord() {
        //inputFile设置为服务器播放地址，outputFile设置为本地地址，这里演示.mp4，也可以是flv等其他后缀名
        String inputFile = "rtsp://admin:admin@192.168.2.236:37779/cam/realmonitor?channel=1&subtype=0";
        // Decodes-encodes
        String outputFile = "recorde.mp4";
        try {
            JavacvUtil.frameRecord(inputFile, outputFile,1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testRecordPush() {
        String inputFile = "rtsp://admin:admin@192.168.2.236:37779/cam/realmonitor?channel=1&subtype=0";
        String outputFile="rtmp://192.168.30.21/live/pushFlow";
        try {
            JavacvUtil.recordPush(inputFile, outputFile,25);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testRecordCamAndMicrophoneToLocal() {
        try {
            JavacvUtil.recordWebcamAndMicrophone(0,4,"rtmp://localhost:1935/hls/record1",640,480,25);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
