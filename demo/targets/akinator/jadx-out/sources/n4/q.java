package n4;

import androidx.datastore.preferences.protobuf.r2;
import androidx.datastore.preferences.protobuf.s2;
import androidx.datastore.preferences.protobuf.x;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface q extends s2 {
    boolean getBoolean();

    x getBytes();

    @Override // androidx.datastore.preferences.protobuf.s2
    /* synthetic */ r2 getDefaultInstanceForType();

    double getDouble();

    float getFloat();

    int getInteger();

    long getLong();

    String getString();

    x getStringBytes();

    l getStringSet();

    o getValueCase();

    boolean hasBoolean();

    boolean hasBytes();

    boolean hasDouble();

    boolean hasFloat();

    boolean hasInteger();

    boolean hasLong();

    boolean hasString();

    boolean hasStringSet();

    @Override // androidx.datastore.preferences.protobuf.s2
    /* synthetic */ boolean isInitialized();
}
