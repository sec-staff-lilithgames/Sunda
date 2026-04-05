package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.impl.o2;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class g8 extends k3 {

    /* renamed from: a, reason: collision with root package name */
    private String f14012a;

    /* renamed from: b, reason: collision with root package name */
    private com.applovin.impl.sdk.k f14013b;

    /* renamed from: c, reason: collision with root package name */
    private p2 f14014c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a extends p2 {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ List f14015e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, List list) {
            super(context);
            this.f14015e = list;
        }

        @Override // com.applovin.impl.p2
        public o2 a() {
            return new o2.b(o2.c.SECTION_CENTERED).d("A plus in front of each segment indicates inclusion and a minus indicates exclusion. The comma in comma-separated values functions as an ∨ (or) operator, and a new row functions as an ∧ (and) operator.").a();
        }

        @Override // com.applovin.impl.p2
        public int b() {
            return 1;
        }

        @Override // com.applovin.impl.p2
        public List c(int i10) {
            return this.f14015e;
        }

        @Override // com.applovin.impl.p2
        public int d(int i10) {
            return this.f14015e.size();
        }

        @Override // com.applovin.impl.p2
        public o2 e(int i10) {
            return new t4("SEGMENT TARGETING");
        }
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(o2.a(o2.c.DETAIL).d((String) it.next()).a());
        }
        return arrayList;
    }

    @Override // com.applovin.impl.k3
    public com.applovin.impl.sdk.k getSdk() {
        return this.f14013b;
    }

    public void initialize(String str, List<String> list, com.applovin.impl.sdk.k kVar) {
        this.f14012a = str;
        this.f14013b = kVar;
        a aVar = new a(this, a(list));
        this.f14014c = aVar;
        aVar.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.k3, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        setTitle(this.f14012a);
        ((ListView) findViewById(R.id.listView)).setAdapter((ListAdapter) this.f14014c);
    }
}
