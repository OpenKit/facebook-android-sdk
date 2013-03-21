package io.openkit.facebook.helpers;

import android.content.Context;

public class ResourceHelper {
	
	public static int getStringResourceID(Context ctx, String resourceName)
	{
		return ctx.getResources().getIdentifier(resourceName, "string", ctx.getPackageName());
	}
	
	public static String getString(Context ctx, String resourceName)
	{
		return ctx.getResources().getString(getStringResourceID(ctx, resourceName));
	}

}
