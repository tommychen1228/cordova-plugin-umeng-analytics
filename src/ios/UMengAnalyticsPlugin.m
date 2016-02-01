//
//  UMengAnalyticsPlugin.m
//  爱尔生活
//
//  Created by cdm on 2/1/16.
//
//

#import "UMengAnalyticsPlugin.h"
#import "MobClick.h"

@implementation UMengAnalyticsPlugin

- (void)initApp:(CDVInvokedUrlCommand *)command{
    NSArray *arguments = command.arguments;
    NSString *androidAppkey = [arguments objectAtIndex:0];
    NSString *iosAppkey = [arguments objectAtIndex:1];
    [MobClick startWithAppkey:iosAppkey];
    
    CDVPluginResult* pluginResult = [CDVPluginResult resultWithStatus:CDVCommandStatus_OK];
    
    [self.commandDelegate sendPluginResult:pluginResult callbackId:command.callbackId];
}

- (void)pause:(CDVInvokedUrlCommand *)command {
    [MobClick beginLogPageView:@"Page"];
}

- (void)resume:(CDVInvokedUrlCommand *)command {
    [MobClick endLogPageView:@"Page"];
}

@end
