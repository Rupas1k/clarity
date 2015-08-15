package skadistats.clarity.decoder.s2.prop;

import skadistats.clarity.decoder.BitStream;
import skadistats.clarity.decoder.s2.FieldDecoder;
import skadistats.clarity.model.s2.Field;

public class UInt32Decoder implements FieldDecoder<Integer> {

    @Override
    public Integer decode(BitStream bs, Field f) {
        return bs.readVarUInt();
    }
}
