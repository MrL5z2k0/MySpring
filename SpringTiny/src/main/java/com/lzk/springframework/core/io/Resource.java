package com.lzk.springframework.core.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author kasuo
 * @date 2021/8/18 11:35 上午
 */
public interface Resource {

    InputStream getInputStream() throws IOException;

}
