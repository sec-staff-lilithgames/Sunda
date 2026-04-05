package com.fyber.inneractive.sdk.click;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.network.z0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.h0;
import com.fyber.inneractive.sdk.util.k1;
import com.fyber.inneractive.sdk.util.l1;
import java.util.List;
import java.util.Locale;
import java.util.PriorityQueue;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class d implements a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f23168a = false;

    @Override // com.fyber.inneractive.sdk.click.a
    public final boolean a(Uri uri, r rVar) {
        return "smartlink".equalsIgnoreCase(uri.getScheme()) && !this.f23168a;
    }

    @Override // com.fyber.inneractive.sdk.click.a
    public final void cancel() {
        this.f23168a = true;
    }

    @Override // com.fyber.inneractive.sdk.click.a
    public final b a(Context context, Uri uri, List list) {
        Uri uri2;
        Uri uri3;
        boolean zA;
        if (!a(uri, null)) {
            return null;
        }
        PriorityQueue priorityQueue = new PriorityQueue();
        String queryParameter = uri.getQueryParameter("primaryUrl");
        List<String> queryParameters = uri.getQueryParameters("primaryTrackingUrl");
        k1 k1Var = k1.Primary;
        try {
            uri2 = Uri.parse(queryParameter);
        } catch (Exception unused) {
            uri2 = null;
        }
        if (uri2 != null) {
            priorityQueue.offer(new l1(k1Var, uri2, queryParameters));
        }
        String queryParameter2 = uri.getQueryParameter("fallbackUrl");
        List<String> queryParameters2 = uri.getQueryParameters("fallbackTrackingUrl");
        k1 k1Var2 = k1.FallBack;
        try {
            uri3 = Uri.parse(queryParameter2);
        } catch (Exception unused2) {
            uri3 = null;
        }
        if (uri3 != null) {
            priorityQueue.offer(new l1(k1Var2, uri3, queryParameters2));
        }
        if (priorityQueue.size() <= 0) {
            String string = uri.toString();
            q qVar = q.DEEP_LINK;
            if (list != null) {
                list.add(new j(string, false, qVar, null));
            }
            return r.a(uri.toString(), "FyberDeepLink", "fyberDeepLink is not valid");
        }
        do {
            l1 l1Var = (l1) priorityQueue.poll();
            if (l1Var == null) {
                return r.a(uri.toString(), "FyberDeepLink", "IADeeplinkUtil.tryHandleDeepLinkWithExternalApp has failed");
            }
            Uri uri4 = l1Var.f26789b;
            String scheme = uri4.getScheme();
            q qVar2 = (TextUtils.isEmpty(scheme) || !scheme.toLowerCase(Locale.US).startsWith("http")) ? q.OPEN_IN_EXTERNAL_APPLICATION : q.OPENED_IN_EXTERNAL_BROWSER;
            zA = h0.a(context, new Intent("android.intent.action.VIEW", uri4));
            String string2 = uri4.toString();
            if (list != null) {
                list.add(new j(string2, zA, qVar2, null));
            }
            if (zA) {
                for (String str : l1Var.f26790c) {
                    if (!TextUtils.isEmpty(str)) {
                        IAlog.d("%s %s", "SMART_LINK", str);
                        z0.b(str);
                    }
                }
            }
        } while (!zA);
        return new b(uri.toString(), q.OPEN_IN_EXTERNAL_APPLICATION, "FyberDeepLink", null);
    }
}
