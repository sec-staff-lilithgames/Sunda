package a2;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.View;
import com.digidust.elokence.akinator.freemium.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class i3 {

    /* renamed from: a, reason: collision with root package name */
    public static final Class[] f3652a = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    public static final e3 DisposableSaveableStateRegistry(View view, v5.j owner) {
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
        kotlin.jvm.internal.e0.checkNotNullParameter(owner, "owner");
        Object parent = view.getParent();
        if (parent == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        View view2 = (View) parent;
        Object tag = view2.getTag(R.id.compose_view_saveable_id_tag);
        String strValueOf = tag instanceof String ? (String) tag : null;
        if (strValueOf == null) {
            strValueOf = String.valueOf(view2.getId());
        }
        return DisposableSaveableStateRegistry(strValueOf, owner);
    }

    public static final boolean a(Object obj) {
        if (obj instanceof b1.d0) {
            b1.d0 d0Var = (b1.d0) obj;
            if (d0Var.getPolicy() != p0.z4.neverEqualPolicy() && d0Var.getPolicy() != p0.z4.structuralEqualityPolicy() && d0Var.getPolicy() != p0.z4.referentialEqualityPolicy()) {
                return false;
            }
            Object value = d0Var.getValue();
            if (value == null) {
                return true;
            }
            return a(value);
        }
        if ((obj instanceof tu.i) && (obj instanceof Serializable)) {
            return false;
        }
        for (int i10 = 0; i10 < 7; i10++) {
            if (f3652a[i10].isInstance(obj)) {
                return true;
            }
        }
        return false;
    }

    public static final Bundle access$toBundle(Map map) {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            bundle.putParcelableArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
        }
        return bundle;
    }

    public static final e3 DisposableSaveableStateRegistry(String id2, v5.j savedStateRegistryOwner) {
        LinkedHashMap linkedHashMap;
        boolean z10;
        kotlin.jvm.internal.e0.checkNotNullParameter(id2, "id");
        kotlin.jvm.internal.e0.checkNotNullParameter(savedStateRegistryOwner, "savedStateRegistryOwner");
        String str = a1.h.class.getSimpleName() + AbstractJsonLexerKt.COLON + id2;
        v5.h savedStateRegistry = savedStateRegistryOwner.getSavedStateRegistry();
        Bundle bundleConsumeRestoredStateForKey = savedStateRegistry.consumeRestoredStateForKey(str);
        if (bundleConsumeRestoredStateForKey != null) {
            linkedHashMap = new LinkedHashMap();
            Set<String> setKeySet = bundleConsumeRestoredStateForKey.keySet();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(setKeySet, "this.keySet()");
            for (String key : setKeySet) {
                ArrayList parcelableArrayList = bundleConsumeRestoredStateForKey.getParcelableArrayList(key);
                if (parcelableArrayList != null) {
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(key, "key");
                    linkedHashMap.put(key, parcelableArrayList);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.Any?> }");
                }
            }
        } else {
            linkedHashMap = null;
        }
        a1.h hVarSaveableStateRegistry = a1.l.SaveableStateRegistry(linkedHashMap, h3.f3613e);
        try {
            savedStateRegistry.registerSavedStateProvider(str, new g3(hVarSaveableStateRegistry));
            z10 = true;
        } catch (IllegalArgumentException unused) {
            z10 = false;
        }
        return new e3(hVarSaveableStateRegistry, new f3(z10, savedStateRegistry, str));
    }
}
