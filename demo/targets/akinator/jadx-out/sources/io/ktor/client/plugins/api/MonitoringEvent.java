package io.ktor.client.plugins.api;

import io.ktor.client.HttpClient;
import io.ktor.events.EventDefinition;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kv.l;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class MonitoringEvent<Param, Event extends EventDefinition<Param>> implements ClientHook<l> {
    private final Event event;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.client.plugins.api.MonitoringEvent$install$1, reason: invalid class name */
    public static final class AnonymousClass1 extends f0 implements l {
        final /* synthetic */ l $handler;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(l lVar) {
            super(1);
            this.$handler = lVar;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m4279invoke((AnonymousClass1) obj);
            return x0.f87415a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m4279invoke(Param it) {
            e0.checkNotNullParameter(it, "it");
            this.$handler.invoke(it);
        }
    }

    public MonitoringEvent(Event event) {
        e0.checkNotNullParameter(event, "event");
        this.event = event;
    }

    @Override // io.ktor.client.plugins.api.ClientHook
    public void install(HttpClient client, l handler) {
        e0.checkNotNullParameter(client, "client");
        e0.checkNotNullParameter(handler, "handler");
        client.getMonitor().subscribe(this.event, new AnonymousClass1(handler));
    }
}
