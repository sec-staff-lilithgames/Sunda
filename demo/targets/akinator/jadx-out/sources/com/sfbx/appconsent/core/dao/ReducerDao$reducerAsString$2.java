package com.sfbx.appconsent.core.dao;

import android.content.res.Resources;
import com.applovin.shadow.okio.Segment;
import com.sfbx.appconsent.core.R;
import gv.d;
import gv.y;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kv.a;
import sv.g;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class ReducerDao$reducerAsString$2 extends f0 implements a {
    final /* synthetic */ ReducerDao this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReducerDao$reducerAsString$2(ReducerDao reducerDao) {
        super(0);
        this.this$0 = reducerDao;
    }

    @Override // kv.a
    public final String invoke() throws Resources.NotFoundException {
        InputStream inputStreamOpenRawResource = this.this$0.context.getResources().openRawResource(R.raw.store);
        e0.checkNotNullExpressionValue(inputStreamOpenRawResource, "context.resources.openRawResource(R.raw.store)");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpenRawResource, g.f86134b), Segment.SIZE);
        try {
            String text = y.readText(bufferedReader);
            d.closeFinally(bufferedReader, null);
            return text;
        } finally {
        }
    }
}
