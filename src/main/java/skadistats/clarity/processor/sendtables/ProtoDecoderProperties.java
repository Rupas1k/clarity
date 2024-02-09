package skadistats.clarity.processor.sendtables;

import skadistats.clarity.io.s2.DecoderProperties;
import skadistats.clarity.io.s2.SerializerId;

public class ProtoDecoderProperties implements DecoderProperties {

    Integer encodeFlags;
    Integer bitCount;
    Float lowValue;
    Float highValue;
    String encoderType;
    SerializerId[] polymorphicTypes;

    ProtoDecoderProperties(Integer encodeFlags, Integer bitCount, Float lowValue, Float highValue, String encoderType, SerializerId[] polymorphicTypes) {
        this.encodeFlags = encodeFlags;
        this.bitCount = bitCount;
        this.lowValue = lowValue;
        this.highValue = highValue;
        this.encoderType = encoderType;
        this.polymorphicTypes = polymorphicTypes;
    }

    @Override
    public Integer getEncodeFlags() {
        return encodeFlags;
    }

    @Override
    public Integer getBitCount() {
        return bitCount;
    }

    @Override
    public Float getLowValue() {
        return lowValue;
    }

    @Override
    public Float getHighValue() {
        return highValue;
    }

    @Override
    public String getEncoderType() {
        return encoderType;
    }

    @Override
    public int getEncodeFlagsOrDefault(int defaultValue) {
        return encodeFlags != null ? encodeFlags : defaultValue;
    }

    @Override
    public int getBitCountOrDefault(int defaultValue) {
        return bitCount != null ? bitCount : defaultValue;
    }

    @Override
    public float getLowValueOrDefault(float defaultValue) {
        return lowValue != null ? lowValue : defaultValue;
    }

    @Override
    public float getHighValueOrDefault(float defaultValue) {
        return highValue != null ? highValue : defaultValue;
    }

    @Override
    public SerializerId[] getPolymorphicTypes() {
        return polymorphicTypes;
    }

}
