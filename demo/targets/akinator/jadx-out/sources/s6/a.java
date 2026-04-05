package s6;

import kotlinx.coroutines.channels.ProducerScope;
import r6.c;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a implements r6.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f85473a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ProducerScope f85474b;

    public a(c cVar, ProducerScope producerScope) {
        this.f85473a = cVar;
        this.f85474b = producerScope;
    }

    @Override // r6.a
    public void onConstraintChanged(Object obj) {
        c cVar = this.f85473a;
        this.f85474b.getChannel().mo5139trySendJP2dKIU(cVar.isConstrained(obj) ? new c.a(cVar.a()) : r6.b.f83807a);
    }
}
