
#import <Cordova/CDVPlugin.h>

@interface CDVDevice : CDVPlugin{
}

//The hooks for my new plugin commands
- (void)echo:(CDVInvokedUrlCommand *)command;
- (void)getDate:(CDVInvokedUrlCommand *)command;

@end
