package n4;

import androidx.datastore.preferences.protobuf.r2;
import androidx.datastore.preferences.protobuf.s2;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface j extends s2 {
    boolean containsPreferences(String str);

    @Override // androidx.datastore.preferences.protobuf.s2
    /* synthetic */ r2 getDefaultInstanceForType();

    @Deprecated
    Map<String, p> getPreferences();

    int getPreferencesCount();

    Map<String, p> getPreferencesMap();

    p getPreferencesOrDefault(String str, p pVar);

    p getPreferencesOrThrow(String str);

    @Override // androidx.datastore.preferences.protobuf.s2
    /* synthetic */ boolean isInitialized();
}
