package easy.devils.serialize.impl;

import easy.devils.serialize.ISerialize;

/**
 * Java 原生序列化
 * @author limengyu
 * @create 2017/11/8
 */
public class JavaSerializeImpl implements ISerialize {
    @Override
    public <T> byte[] serialize(T t) {
        return new byte[0];
    }

    @Override
    public <T> T deserialize(byte[] bytes, T t) {
        return null;
    }
}
