package com.xinchao.javacv;

import com.xinchao.javacv.utils.AudioConvert;
import org.bytedeco.javacpp.avcodec;
import org.junit.Test;

/**
 * @Auther: 杜威
 * @Date: 2018/10/24 11:32
 * @Description:
 */
public class AudioConvertTest {

    @Test
    public void testAudioConvert() {
        //pcm参数转换
        //convert("东部信息.wav", "eguid.wav", avcodec.AV_CODEC_ID_PCM_S16LE, 8000, 16000,1);
        //pcm转mp3编码示例
        AudioConvert.convert("东部信息.wav", "eguid.mp3", avcodec.AV_CODEC_ID_MP3, 8000, 16,1);
    }
}
