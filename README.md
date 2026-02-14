# CoreTuff

**A lightweight, essential utility plugin for Minecraft servers.**

CoreTuff provides a clean set of commands for server management and player utilities - nothing more, nothing less.

## Features

### Gamemode Commands
| Command | Description |
|---------|-------------|
| `/gmc` | Switch to Creative mode |
| `/gms` | Switch to Survival mode |
| `/gma` | Switch to Adventure mode |
| `/gmsp` | Switch to Spectator mode |

### Player Utilities
| Command | Description |
|---------|-------------|
| `/fly` | Toggle flight mode on/off |
| `/suicide` | Respawn when stuck |
| `/heal` | Restore health to full |
| `/feed` | Restore hunger to full |

## Permissions

All permissions follow a simple, consistent format: `coretuff.command.<command>`

| Permission | Description |
|------------|-------------|
| `coretuff.command.gmc` | Access to `/gmc` |
| `coretuff.command.gms` | Access to `/gms` |
| `coretuff.command.gma` | Access to `/gma` |
| `coretuff.command.gmsp` | Access to `/gmsp` |
| `coretuff.command.fly` | Access to `/fly` |
| `coretuff.command.suicide` | Access to `/suicide` |
| `coretuff.command.heal` | Access to `/heal` |
| `coretuff.command.feed` | Access to `/feed` |
| `coretuff.command.coretuff` | Access to `/coretuff` |

### Admin Permission
| Permission | Description |
|------------|-------------|
| `coretuff.admin` | Grants access to ALL Coretuff commands (inherits all above) |

## Requirements

- **Server Software:** Paper, or any Paper-compatible fork
- **Minecraft Version:** 1.21 or higher
- **Java Version:** Java 21 or higher

## Why CoreTuff?

- **Lightweight** - Minimal impact on server performance
- **No Bloat** - Only useful commands, nothing unnecessary
- **Simple** - Easy to use and configure
- **Permission Friendly** - Granular control with inheritance

## Support

- Found a bug? Open an issue on GitHub
- Have a suggestion? Let me know!
- Contributions welcome via pull requests

## License

This project is open source and available under the GNU General Public License v3.

*CoreTuff - Making server management a little easier, one command at a time.*
