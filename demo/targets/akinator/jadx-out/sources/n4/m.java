package n4;

import androidx.datastore.preferences.protobuf.r2;
import androidx.datastore.preferences.protobuf.s2;
import androidx.datastore.preferences.protobuf.x;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface m extends s2 {
    @Override // androidx.datastore.preferences.protobuf.s2
    /* synthetic */ r2 getDefaultInstanceForType();

    String getStrings(int i10);

    x getStringsBytes(int i10);

    int getStringsCount();

    List<String> getStringsList();

    @Override // androidx.datastore.preferences.protobuf.s2
    /* synthetic */ boolean isInitialized();
}
