package com.fyber.inneractive.sdk.flow;

import android.text.TextUtils;
import b0.e2;
import com.fyber.inneractive.sdk.util.IAlog;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class t implements com.fyber.inneractive.sdk.network.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u f23891a;

    public t(u uVar) {
        this.f23891a = uVar;
    }

    @Override // com.fyber.inneractive.sdk.network.f0
    public final void a(Object obj, Exception exc, boolean z10) {
        String str = (String) obj;
        IAlog.a("IAVideoContentLoader : Remote ui template callback onNetworkResult from cache: %s", Boolean.valueOf(z10));
        if (exc instanceof com.fyber.inneractive.sdk.network.g) {
            return;
        }
        u uVar = this.f23891a;
        uVar.getClass();
        if (TextUtils.isEmpty(str) && z10) {
            uVar.a(exc, "Fetched cached template is ".concat(str == null ? AbstractJsonLexerKt.NULL : "empty"), true);
            return;
        }
        com.fyber.inneractive.sdk.player.ui.remote.g gVarJ = uVar.j();
        if (gVarJ == null) {
            uVar.a(null, "Flow Manager is null", z10);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            boolean z11 = gVarJ.f26316a.f26295i;
            StringBuilder sb2 = new StringBuilder("Unknown error while receiving template: templateContent is: ");
            sb2.append(TextUtils.isEmpty(str) ? "null or empty" : "not null and not empty");
            sb2.append(" isFromCache: ");
            sb2.append(z11);
            uVar.a(exc, sb2.toString(), z11);
            return;
        }
        com.fyber.inneractive.sdk.player.ui.remote.d dVar = gVarJ.f26316a;
        dVar.f26295i = z10;
        IAlog.a("%s : schedule UI load timeout task with delay: %d", "RemoteUIWebviewController", 10000);
        com.fyber.inneractive.sdk.util.r.f26804b.postDelayed(dVar.f26297k, 10000);
        try {
            dVar.f26288b.loadData(str, "text/html", C.UTF8_NAME);
        } catch (Throwable th2) {
            IAlog.a("%s : cancel UI load timeout task", "RemoteUIWebviewController");
            com.fyber.inneractive.sdk.util.r.f26804b.removeCallbacks(dVar.f26297k);
            dVar.a(com.fyber.inneractive.sdk.network.events.b.WEB_VIEW_CRASH_ERROR, e2.o(th2, new StringBuilder("Unable load data: ")), true, null);
        }
    }
}
