//
//  UMengAnalyticsPlugin.h
//  爱尔生活
//
//  Created by cdm on 2/1/16.
//
//

#import <Foundation/Foundation.h>
#import <Cordova/CDV.h>

@interface UMengAnalyticsPlugin : CDVPlugin

- (void)initApp:(CDVInvokedUrlCommand *)command;

- (void)resume:(CDVInvokedUrlCommand *)command;

- (void)pause:(CDVInvokedUrlCommand *)command;

@end
