package mk;

import com.google.gson.Gson;
import com.google.gson.internal.Excluder;
import com.google.gson.k0;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class c extends k0 {

    /* renamed from: a, reason: collision with root package name */
    public volatile k0 f74752a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f74753b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f74754c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Gson f74755d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pk.a f74756e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Excluder f74757f;

    public c(Excluder excluder, boolean z10, boolean z11, Gson gson, pk.a aVar) {
        this.f74757f = excluder;
        this.f74753b = z10;
        this.f74754c = z11;
        this.f74755d = gson;
        this.f74756e = aVar;
    }

    @Override // com.google.gson.k0
    public Object read(JsonReader jsonReader) throws IOException {
        if (this.f74753b) {
            jsonReader.skipValue();
            return null;
        }
        k0 delegateAdapter = this.f74752a;
        if (delegateAdapter == null) {
            delegateAdapter = this.f74755d.getDelegateAdapter(this.f74757f, this.f74756e);
            this.f74752a = delegateAdapter;
        }
        return delegateAdapter.read(jsonReader);
    }

    @Override // com.google.gson.k0
    public void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (this.f74754c) {
            jsonWriter.nullValue();
            return;
        }
        k0 delegateAdapter = this.f74752a;
        if (delegateAdapter == null) {
            delegateAdapter = this.f74755d.getDelegateAdapter(this.f74757f, this.f74756e);
            this.f74752a = delegateAdapter;
        }
        delegateAdapter.write(jsonWriter, obj);
    }
}
