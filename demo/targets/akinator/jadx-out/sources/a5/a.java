package a5;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlinx.coroutines.flow.MutableStateFlow;
import t3.e;
import tu.e0;
import tu.v;
import uu.p1;
import v5.g;
import v5.k;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4064a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4065b;

    public /* synthetic */ a(Object obj, int i10) {
        this.f4064a = i10;
        this.f4065b = obj;
    }

    @Override // v5.g
    public final Bundle saveState() {
        v[] vVarArr;
        switch (this.f4064a) {
            case 0:
                b bVar = (b) this.f4065b;
                for (Map.Entry entry : p1.toMap(bVar.f4069d).entrySet()) {
                    bVar.set((String) entry.getKey(), ((MutableStateFlow) entry.getValue()).getValue());
                }
                for (Map.Entry entry2 : p1.toMap(bVar.f4067b).entrySet()) {
                    bVar.set((String) entry2.getKey(), ((g) entry2.getValue()).saveState());
                }
                Map map = bVar.f4066a;
                if (map.isEmpty()) {
                    vVarArr = new v[0];
                } else {
                    ArrayList arrayList = new ArrayList(map.size());
                    for (Map.Entry entry3 : map.entrySet()) {
                        arrayList.add(e0.to((String) entry3.getKey(), entry3.getValue()));
                    }
                    vVarArr = (v[]) arrayList.toArray(new v[0]);
                }
                Bundle bundleBundleOf = e.bundleOf((v[]) Arrays.copyOf(vVarArr, vVarArr.length));
                k.m7521constructorimpl(bundleBundleOf);
                return bundleBundleOf;
            default:
                return ComponentActivity.a((ComponentActivity) this.f4065b);
        }
    }
}
