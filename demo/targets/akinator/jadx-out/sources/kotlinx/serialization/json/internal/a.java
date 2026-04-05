package kotlinx.serialization.json.internal;

import kotlin.jvm.internal.b1;
import kotlinx.serialization.json.JsonElement;
import kv.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final /* synthetic */ class a implements l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f71925b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f71926c;

    public /* synthetic */ a(Object obj, int i10) {
        this.f71925b = i10;
        this.f71926c = obj;
    }

    @Override // kv.l
    public final Object invoke(Object obj) {
        switch (this.f71925b) {
            case 0:
                return AbstractJsonTreeEncoder.beginStructure$lambda$2((AbstractJsonTreeEncoder) this.f71926c, (JsonElement) obj);
            default:
                return TreeJsonEncoderKt.writeJson$lambda$0((b1) this.f71926c, (JsonElement) obj);
        }
    }
}
