package nh;

import java.util.Spliterator;
import java.util.function.Consumer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final /* synthetic */ class j1 implements Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f76376a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l1 f76377b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f76378c;

    public /* synthetic */ j1(l1 l1Var, Object obj, int i10) {
        this.f76376a = i10;
        this.f76377b = l1Var;
        this.f76378c = obj;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f76376a) {
            case 0:
                Consumer consumer = (Consumer) this.f76378c;
                Spliterator spliterator = (Spliterator) this.f76377b.f76436c.apply(obj);
                if (spliterator != null) {
                    spliterator.forEachRemaining(consumer);
                    break;
                }
                break;
            default:
                Spliterator.OfPrimitive ofPrimitive = (Spliterator.OfPrimitive) ((r1) this.f76377b).f76436c.apply(obj);
                if (ofPrimitive != null) {
                    ofPrimitive.forEachRemaining((Spliterator.OfPrimitive) this.f76378c);
                    break;
                }
                break;
        }
    }
}
