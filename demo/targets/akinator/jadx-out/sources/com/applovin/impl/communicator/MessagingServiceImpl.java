package com.applovin.impl.communicator;

import a2.s;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorMessagingService;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class MessagingServiceImpl implements AppLovinCommunicatorMessagingService {

    /* renamed from: a, reason: collision with root package name */
    private ScheduledThreadPoolExecutor f13799a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f13800b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final Map f13801c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private final Object f13802d = new Object();

    private Queue a(String str) {
        LinkedList linkedList;
        synchronized (this.f13802d) {
            try {
                Queue queue = (Queue) this.f13801c.get(str);
                linkedList = queue != null ? new LinkedList(queue) : new LinkedList();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return linkedList;
    }

    private void b(CommunicatorMessageImpl communicatorMessageImpl) {
        if (communicatorMessageImpl.sticky) {
            synchronized (this.f13802d) {
                try {
                    Queue queue = (Queue) this.f13801c.get(communicatorMessageImpl.getTopic());
                    if (queue != null) {
                        queue.add(communicatorMessageImpl);
                        if (queue.size() > 10) {
                            queue.remove();
                        }
                    } else {
                        LinkedList linkedList = new LinkedList();
                        linkedList.add(communicatorMessageImpl);
                        this.f13801c.put(communicatorMessageImpl.getTopic(), linkedList);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    private void c(CommunicatorMessageImpl communicatorMessageImpl) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutorA = a();
        this.f13799a = scheduledThreadPoolExecutorA;
        scheduledThreadPoolExecutorA.execute(new s(communicatorMessageImpl, 10));
    }

    public void maybeSendStickyMessages(String str) {
        Iterator it = a(str).iterator();
        while (it.hasNext()) {
            c((CommunicatorMessageImpl) it.next());
        }
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorMessagingService
    public void publish(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        c(appLovinCommunicatorMessage);
        b(appLovinCommunicatorMessage);
    }

    public String toString() {
        return "MessagingServiceImpl{}";
    }

    private ScheduledThreadPoolExecutor a() {
        synchronized (this.f13800b) {
            try {
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.f13799a;
                if (scheduledThreadPoolExecutor != null) {
                    return scheduledThreadPoolExecutor;
                }
                return new ScheduledThreadPoolExecutor(1, new a(0));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Thread a(Runnable runnable) {
        Thread thread = new Thread(runnable, "AppLovinSdk:communicator");
        thread.setPriority(1);
        thread.setDaemon(true);
        return thread;
    }
}
