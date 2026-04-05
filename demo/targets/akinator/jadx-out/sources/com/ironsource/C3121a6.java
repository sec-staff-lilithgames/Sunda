package com.ironsource;

import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import com.ironsource.Y5;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.a6, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C3121a6 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f35935a;

    /* renamed from: b, reason: collision with root package name */
    private final C3281j5 f35936b;

    /* renamed from: c, reason: collision with root package name */
    private final Z5 f35937c;

    /* renamed from: d, reason: collision with root package name */
    private final Pb f35938d;

    /* renamed from: e, reason: collision with root package name */
    private final B7 f35939e = Mb.U().i();

    public C3121a6(Context context, C3281j5 c3281j5, Z5 z52, Pb pb2) {
        this.f35935a = context;
        this.f35936b = c3281j5;
        this.f35937c = z52;
        this.f35938d = pb2;
    }

    public void b(C8 c82) throws Exception {
        if (c82.exists()) {
            ArrayList<C8> filesInFolderRecursive = IronSourceStorageUtils.getFilesInFolderRecursive(c82);
            if (!IronSourceStorageUtils.deleteFolderContentRecursive(c82) || !c82.delete()) {
                throw new Exception("Failed to delete folder");
            }
            this.f35938d.a(filesInFolderRecursive);
        }
    }

    public JSONObject c(C8 c82) throws Exception {
        if (c82.exists()) {
            return IronSourceStorageUtils.buildFilesMapOfDirectory(c82, this.f35938d.b());
        }
        throw new Exception("Folder does not exist");
    }

    public long d(C8 c82) throws Exception {
        if (c82.exists()) {
            return IronSourceStorageUtils.getTotalSizeOfDir(c82);
        }
        throw new Exception("Folder does not exist");
    }

    public void a(C8 c82, String str, int i10, int i11, Pc pc2) throws Exception {
        if (TextUtils.isEmpty(str)) {
            throw new Exception(Y5.a.f35759a);
        }
        if (this.f35939e.a(this.f35936b.a()) <= 0) {
            throw new Exception(C3227g4.A);
        }
        if (!C3119a4.h(this.f35935a)) {
            throw new Exception(C3227g4.C);
        }
        this.f35937c.a(c82.getPath(), new a(pc2));
        if (!c82.exists()) {
            this.f35936b.a(c82, str, i10, i11, this.f35937c);
            return;
        }
        Message message = new Message();
        message.obj = c82;
        message.what = 1015;
        this.f35937c.sendMessage(message);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.a6$a */
    public class a implements Pc {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Pc f35940a;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.ironsource.a6$a$a, reason: collision with other inner class name */
        public class C0211a extends JSONObject {
            public C0211a() throws JSONException {
                put("lastReferencedTime", System.currentTimeMillis());
            }
        }

        public a(Pc pc2) {
            this.f35940a = pc2;
        }

        @Override // com.ironsource.Pc
        public void a(C8 c82) {
            this.f35940a.a(c82);
            try {
                C3121a6.this.f35938d.a(c82.getName(), new C0211a());
            } catch (Exception e10) {
                C3422r4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
            }
        }

        @Override // com.ironsource.Pc
        public void a(C8 c82, C3477u8 c3477u8) {
            this.f35940a.a(c82, c3477u8);
        }
    }

    public void a(C8 c82) throws Exception {
        if (c82.exists()) {
            if (c82.delete()) {
                this.f35938d.a(c82.getName());
                return;
            }
            throw new Exception("Failed to delete file");
        }
    }

    public void a(C8 c82, JSONObject jSONObject) throws Exception {
        if (jSONObject != null) {
            if (c82.exists()) {
                if (!this.f35938d.b(c82.getName(), jSONObject)) {
                    throw new Exception("Failed to update attribute");
                }
                return;
            }
            throw new Exception("File does not exist");
        }
        throw new Exception("Missing attributes to update");
    }
}
