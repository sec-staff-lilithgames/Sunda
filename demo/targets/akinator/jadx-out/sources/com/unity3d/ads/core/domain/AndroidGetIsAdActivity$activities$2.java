package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import pw.l;
import uu.q0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AndroidGetIsAdActivity$activities$2 extends f0 implements kv.a {
    final /* synthetic */ AndroidGetIsAdActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidGetIsAdActivity$activities$2(AndroidGetIsAdActivity androidGetIsAdActivity) {
        super(0);
        this.this$0 = androidGetIsAdActivity;
    }

    @Override // kv.a
    public final List<l> invoke() {
        List<ByteString> observableAndroidActivitiesList = this.this$0.sessionRepository.getNativeConfiguration().getObservableAndroidActivitiesList();
        e0.checkNotNullExpressionValue(observableAndroidActivitiesList, "sessionRepository.native…ableAndroidActivitiesList");
        List<ByteString> list = observableAndroidActivitiesList;
        ArrayList arrayList = new ArrayList(q0.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            byte[] byteArray = ((ByteString) it.next()).toByteArray();
            arrayList.add(l.of(Arrays.copyOf(byteArray, byteArray.length)));
        }
        return arrayList;
    }
}
