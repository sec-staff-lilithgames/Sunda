package com.mbridge.msdk.foundation.download.resource;

import com.mbridge.msdk.foundation.download.database.IDatabaseHelper;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
class ResourceStrategyExecutor implements IResourceStrategy {
    private ResourceStrategy resourceStrategy;

    public ResourceStrategyExecutor(ResourceStrategy resourceStrategy) {
        this.resourceStrategy = resourceStrategy;
    }

    @Override // com.mbridge.msdk.foundation.download.resource.IResourceStrategy
    public String getResourceStrategyName() {
        return this.resourceStrategy.getResourceStrategyName();
    }

    @Override // com.mbridge.msdk.foundation.download.resource.IResourceStrategy
    public void processResource(MBResourceManager mBResourceManager, IDatabaseHelper iDatabaseHelper, ResourceConfig resourceConfig) {
        ResourceStrategy resourceStrategy = this.resourceStrategy;
        if (resourceStrategy != null) {
            try {
                resourceStrategy.processResource(mBResourceManager, iDatabaseHelper, resourceConfig);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }
}
