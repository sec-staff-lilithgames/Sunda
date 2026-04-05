package io.bidmachine;

import io.bidmachine.ExpirationHandler;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class BidToken implements ExpirationHandler.Listener {
    private final AdRequest<?, ?, ?> adRequest;
    private final ExpirationHandler expirationHandler;
    private final ExpirationListener<BidToken> expirationListener;

    /* renamed from: id, reason: collision with root package name */
    private final String f59826id = UUID.randomUUID().toString();

    public BidToken(AdRequest<?, ?, ?> adRequest, int i10, ExpirationListener<BidToken> expirationListener) {
        this.adRequest = adRequest;
        this.expirationHandler = new ExpirationHandler(TimeUnit.SECONDS.toMillis(i10), this, new p1());
        this.expirationListener = expirationListener;
    }

    public void destroyAdRequest() {
        this.adRequest.clearNetworkAdUnits();
        this.adRequest.destroy();
    }

    public AdRequest<?, ?, ?> getAdRequest() {
        return this.adRequest;
    }

    public String getId() {
        return this.f59826id;
    }

    @Override // io.bidmachine.ExpirationHandler.Listener
    public void onExpired() {
        this.expirationListener.onExpired(this);
    }

    public void startExpiration() {
        this.expirationHandler.start();
    }

    public void stopExpiration() {
        this.expirationHandler.stop();
    }
}
